package com.example.rent.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "rent")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rent {
    @Id
    @GeneratedValue
    private Long rentId;
    @CreationTimestamp
    private Date rentDate;
    @UpdateTimestamp
    private Date returnDate;
    private String state;
    private Long articleId;
    private Long borrowerId;

    public Rent(String state, Long articleId, Long borrowerId) {
        this.state = state;
        this.articleId = articleId;
        this.borrowerId = borrowerId;
    }
}
