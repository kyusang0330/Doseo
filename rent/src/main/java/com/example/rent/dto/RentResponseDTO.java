package com.example.rent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentResponseDTO {
    @CreationTimestamp
    private Date rentDate;
    @UpdateTimestamp
    private Date returnDate;
    private String state;
    private Long articleId;
    private Long borrowerId;
}
