package com.example.car.model.pojos.hyj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repe {
    private int repeId;
    private int storeId;
    private int supplierId;
    private int commId;
    private List<Store> store;
    private List<Comm> comms;
}
