package com.virtus.domain.dto.response;

import com.virtus.common.domain.dto.BaseResponseDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class PlanResponseDTO extends BaseResponseDTO {

    private String reference;
    private String name;
    private String description;
    private String cnpb;
    private String legislation;
    private String situation;
    private Double guaranteeResource;
    private String modality;
    private EntityVirtusResponseDTO entity;

    private PlanResponseDTO(Builder builder) {
        this.reference = builder.reference;
        this.name = builder.name;
        this.description = builder.description;
        this.cnpb = builder.cnpb;
        this.legislation = builder.legislation;
        this.situation = builder.situation;
        this.guaranteeResource = builder.guaranteeResource;
        this.modality = builder.modality;
        this.entity = builder.entity;
        this.setId(builder.id);
    }

    public PlanResponseDTO() {

    }

    public static class Builder {

        public EntityVirtusResponseDTO entity;
        private Integer id;
        private String reference;
        private String name;
        private String description;
        private String cnpb;
        private String legislation;
        private String situation;
        private Double guaranteeResource;
        private String modality;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder entity(EntityVirtusResponseDTO entity) {
            this.entity = entity;
            return this;
        }

        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder cnpb(String cnpb) {
            this.cnpb = cnpb;
            return this;
        }

        public Builder legislation(String legislation) {
            this.legislation = legislation;
            return this;
        }

        public Builder situation(String situation) {
            this.situation = situation;
            return this;
        }

        public Builder guaranteeResource(Double guaranteeResource) {
            this.guaranteeResource = guaranteeResource;
            return this;
        }

        public Builder modality(String modality) {
            this.modality = modality;
            return this;
        }

        public PlanResponseDTO build() {
            return new PlanResponseDTO(this);
        }
    }
}
