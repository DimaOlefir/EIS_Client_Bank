package com.eisgroup.cb.model;

/**
 * Created by Tanya on 14.07.2017.
 */
public interface PaymentMethod<T extends BaseObject> {
    String getLabel();

    Account getPaymentAccount();

    PaymentType getPaymentsType();

    public enum PaymentType {
        CARD("Card"), ACCOUNT("Account");

        private String name;

        PaymentType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
