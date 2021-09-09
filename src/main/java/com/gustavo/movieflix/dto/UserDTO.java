package com.gustavo.movieflix.dto;


import com.gustavo.movieflix.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private Long roleId;
    private List<ReviewDTO> reviews = new ArrayList<>();

    public UserDTO() {

    }

    public UserDTO(Long id, String name, String email, Long roleId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roleId = roleId;
    }

    public UserDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email =  entity.getEmail();
        roleId = entity.getRole().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public List<ReviewDTO> getReviews() {
        return reviews;
    }
}
