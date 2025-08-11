package org.acme;

import org.jboss.logging.Logger;
import picocli.CommandLine;


@CommandLine.Command
public class HelloCommand implements Runnable {

    private Logger log = Logger.getLogger(HelloCommand.class);

    @Override
    public void run() {
        log.warn("hello with umlauts äöüß from logger");
    }
}
