package com.app.ecommerce.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_description")
    private String roleDescription;
}
