package com.bookstore.ServiceBroker.SBProject.Web.Model;

public class ApplicationInformation {

    private final String baseUrl;

    public ApplicationInformation(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
