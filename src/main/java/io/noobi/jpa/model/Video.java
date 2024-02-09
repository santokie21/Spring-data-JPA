package io.noobi.jpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
//@DiscriminatorValue("V")
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="video_id")
public class Video extends Resource {

    private int length;
}
