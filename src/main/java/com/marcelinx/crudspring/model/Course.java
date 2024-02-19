package com.marcelinx.crudspring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.validation.constraints.Pattern;
import lombok.Data;

@SuppressWarnings("deprecation")
@Data
@Entity
@SQLDelete(sql = "UPDATE Course SET status = 'Inativo' WHERE id = ?")
@Where(clause = "status = 'Ativo'")
public class Course {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonProperty("_id")
  private Long id;

  @NotBlank
  @NotNull
  @org.hibernate.validator.constraints.Length(min = 5, max = 100)
  @Column(length = 100, nullable = false)
  private String name;

  @NotNull
  @org.hibernate.validator.constraints.Length(max = 10)
  @Pattern(regexp = "Back-end|Front-end")
  @Column(length = 10, nullable = false)
  private String category;

  @NotNull
  @org.hibernate.validator.constraints.Length(max = 10)
  @Pattern(regexp = "Ativo|Inativo")
  @Column(length = 10, nullable = false)
  private String status = "Ativo";

}