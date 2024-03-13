package it.tasgroup.eu.mockdemo.controller;

import it.tasgroup.eu.mockdemo.controller.model.IntestazionePPT;
import it.tasgroup.eu.mockdemo.controller.model.PaaInviaRT;
import it.tasgroup.eu.mockdemo.controller.model.PaaInviaRTRisposta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RestController
@RequestMapping("/api/mock")
public class MockController {

    @PostMapping("/invia-rt")
    public ResponseEntity<PaaInviaRTRisposta> getMockedResponse(
            @RequestBody PaaInviaRT requestBody,
            @RequestHeader IntestazionePPT headers
            ) {
//        ResponseEntity<PaaInviaRTRisposta> mockedResponseEntity = mock(ResponseEntity.class);
//
//        when(mockedResponseEntity.getBody()).thenReturn("Mocked response body");
//        when(mockedResponseEntity.getStatusCodeValue()).thenReturn(200);
//
//        return mockedResponseEntity;
        return null;
    }
}
