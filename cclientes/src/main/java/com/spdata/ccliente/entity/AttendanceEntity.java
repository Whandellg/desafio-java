package com.spdata.ccliente.entity;

import java.security.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Generated;

@Table
@Data
@Entity
@Generated
public class AttendanceEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private Integer pacient_id;

	@Column(nullable = false)
	private Integer situacao_id;

	@Column(nullable = false)
	private Timestamp datahoraatend;

	@Column(nullable = false)
	private String diagnostic;

	@Column(nullable = false)
	private Timestamp datahoraencer;

	@Column(nullable = false)
	private Timestamp duration;






//  @JsonIgnore
	@ManyToMany
	@JoinColumn(name = "product", referencedColumnName = "id")
	private List<SituationEntity> products;
}