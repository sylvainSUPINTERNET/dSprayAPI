package com.dspray.api.dto;

import org.springframework.stereotype.Component;

@Component
public class AnnouncePostDto {

    public String contractAddress;

    public String contractTitle;

    public int amount;

    public AnnouncePostDto() {}

    public String getContractAddress() {
        return this.contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

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
