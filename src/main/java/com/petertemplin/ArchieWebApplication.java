package com.petertemplin;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ArchieWebApplication extends Application<ArchieWebConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ArchieWebApplication().run(args);
    }

    @Override
    public String getName() {
        return "ArchieWeb";
    }

    @Override
    public void initialize(final Bootstrap<ArchieWebConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ArchieWebConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
