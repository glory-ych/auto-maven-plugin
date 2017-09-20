/*
 * Copyright (C) 2017 www.chuchujie.com All rights reserved.
 *
 * Created by yangchanghui@chuchujie.com on 2017/9/20.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

import java.io.File;
import java.io.IOException;

/**
 * 描述类的功能.
 *
 * @author yangchanghui@chuchujie.com
 */
@Mojo(name = "hello")
public class GeneratorCode extends AbstractMojo {
    public void execute() throws MojoExecutionException {
        getLog().info("123");
        File file = new File("hello.txt");
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