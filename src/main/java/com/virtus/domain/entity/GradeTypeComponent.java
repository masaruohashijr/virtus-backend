package com.virtus.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.virtus.common.domain.entity.BaseEntity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipos_notas_componentes", schema = "virtus")
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class GradeTypeComponent extends BaseEntity {

    @Id
    @Column(name = "id_tipo_nota_componente")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_componente")
    private Component component;

    @ManyToOne
    @JoinColumn(name = "id_tipo_nota")
    private GradeType gradeType;

    @Column(name = "peso_padrao")
    private Integer standardWeight;

    @Column(name = "criado_em")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "id_versao_origem")
    private Integer originVersion;

}
