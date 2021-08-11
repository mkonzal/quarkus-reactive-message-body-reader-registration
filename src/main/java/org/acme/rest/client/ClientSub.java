package org.acme.rest.client;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;

import io.smallrye.mutiny.Uni;

@RegisterProvider(SingleQuoteReader.class)
public interface ClientSub {
    @GET
    @Produces("text/plain")
    Uni<String> test();
}
