package com.virtus.domain.entity;

import com.virtus.common.domain.entity.BaseDefaultEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "itens", schema = "virtus")
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
public class Item extends BaseDefaultEntity {

    @Id
    @Column(name = "id_item")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_elemento")
    private Element element;

    @Column(name = "referencia")
    private String reference;

    @ManyToOne
    @JoinColumn(name = "id_status")
    private Status status;

}
