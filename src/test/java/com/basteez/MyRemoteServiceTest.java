package com.basteez;

import com.basteez.jackson_annotation_poc.pojo.Civilization;
import com.basteez.jackson_annotation_poc.service.AgeOfEmpiresService;
import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.List;
import java.util.Set;

@QuarkusTest
public class MyRemoteServiceTest {

    @Inject
    @RestClient
    AgeOfEmpiresService aoeService;

    @Test
    public void testExtensionsRestClientEndpoint() {
        //List<Civilization> civilizations = aoeService.getCivilizations();

        /*Assertions.assert(1, restClientExtensions.size());
        for (AgeOfEmpiresService.Extension extension : restClientExtensions) {
            Assertions.assertEquals("io.quarkus:quarkus-rest-client", extension.id);
            Assertions.assertEquals("REST Client", extension.name);
            Assertions.assertEquals("REST Client", extension.shortName);
            Assertions.assertTrue(extension.keywords.size() > 1);
            Assertions.assertTrue(extension.keywords.contains("rest-client"));
        }*/
    }
}
