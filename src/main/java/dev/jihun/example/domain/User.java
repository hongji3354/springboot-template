package dev.jihun.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"email"}, name = "UK_USER_EMAIL")
})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String password;

    private String name;

    @Builder
    public User(final String email, final String password, final String name) {
        Assert.hasText(email, "User Email is required");
        Assert.hasText(password, "User Password is required");
        Assert.hasText(name, "User Name is required");

        this.email = email;
        this.password = password;
        this.name = name;
    }
}
