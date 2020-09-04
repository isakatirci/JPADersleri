package com.isakatirci.test3.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Data
@NoArgsConstructor
@Embeddable
public class School {
    @Column(updatable = false)
    @Temporal(value = TemporalType.DATE)
    private Date createdDateSchool;
    private String nameSchool;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "test_name_1", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "addresses")
    private List<String> addresses;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "test_name_2", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "phones")
    @MapKeyEnumerated(value = EnumType.ORDINAL)
    @MapKeyColumn(name = "phoneType")
    private Map<PhoneType, String> phones;

}
