package com.hsa.awsloadbalancer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hosts")
@RequiredArgsConstructor
public class HostResource {

  @GetMapping
  public ResponseEntity<?> getCurrentHost() throws UnknownHostException {
    InetAddress localHost = InetAddress.getLocalHost();
    return ResponseEntity.ok("current host is: ".concat(localHost.getHostAddress()));
  }

}
