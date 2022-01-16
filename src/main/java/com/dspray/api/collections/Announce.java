package com.dspray.api.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "announces")
public class Announce {

    @Id
    public String id;

    public String contractAddress;

    public String contractTitle;

    public int amount;

    public Announce(){}


    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    };

    public String getContractAddress() {
        return this.contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    };

    public String getContractTitle() {
        return this.contractTitle;
    }

    public void setContractTitle(String contractTitle) {
        this.contractTitle = contractTitle;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
