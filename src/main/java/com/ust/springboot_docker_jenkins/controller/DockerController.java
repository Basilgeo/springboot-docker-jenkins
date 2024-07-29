package com.ust.springboot_docker_jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class DockerController {

    @GetMapping("/docker")
    public String docker() {
        return "Docker is running";
    }
}
