package com.virtus.domain.entity;

import com.virtus.common.domain.entity.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "produtos_itens_historicos", schema = "virtus")
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class ProductItemHistoric extends BaseEntity {

    @Id
    @Column(name = "id_produto_item_historico")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_entidade")
    private EntityVirtus entity;

    @ManyToOne
    @JoinColumn(name = "id_ciclo")
    private Cycle cycle;

    @ManyToOne
    @JoinColumn(name = "id_pilar")
    private Pillar pillar;

    @ManyToOne
    @JoinColumn(name = "id_componente")
    private Component component;

    @ManyToOne
    @JoinColumn(name = "id_plano")
    private Plan plan;

    @ManyToOne
    @JoinColumn(name = "id_tipo_nota")
    private GradeType gradeType;

    @ManyToOne
    @JoinColumn(name = "id_elemento")
    private Element element;

    @ManyToOne
    @JoinColumn(name = "id_item")
    private Item item;

    @Column(name = "analise")
    private String analysis;

    @Column(name = "anexo")
    private String attachment;

    @Column(name = "criado_em")
    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "id_status")
    private Status status;

}
