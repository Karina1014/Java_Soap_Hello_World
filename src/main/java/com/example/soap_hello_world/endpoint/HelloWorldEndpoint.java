package com.example.soap_hello_world.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.example.hello_world.GetHelloWorldRequest;
import com.example.hello_world.GetHelloWorldResponse;

@Endpoint
public class HelloWorldEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/hello-world";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHelloWorldRequest")
    @ResponsePayload
    public GetHelloWorldResponse getHelloWorld(@RequestPayload GetHelloWorldRequest request) {
        GetHelloWorldResponse response = new GetHelloWorldResponse();
        response.setMessage("Hello World!");
        return response;
    }
}