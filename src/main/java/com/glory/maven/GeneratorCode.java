package com.glory.maven;/*
 * Copyright (C) 2017 www.chuchujie.com All rights reserved.
 *
 * Created by yangchanghui@chuchujie.com on 2017/9/20.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;
import java.io.IOException;

/**
 * 描述类的功能.
 *
 * @author yangchanghui@chuchujie.com
 */
@Mojo(name = "auto")
public class GeneratorCode extends AbstractMojo {
    @Parameter(property = "baseDir",defaultValue = "")
    private String baseDir;

    public void execute() throws MojoExecutionException {
        getLog().info("invoke auto plugin..." + baseDir);
        StringBuilder path = new StringBuilder();
        if (baseDir != null && !baseDir.equals("")) {
            path.append(baseDir);
        }
        path.append("hello.txt");
        File file = new File(path.toString());
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    getLog().info("file create success");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}