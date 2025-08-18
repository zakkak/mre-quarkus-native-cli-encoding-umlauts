package org.acme;

import org.jboss.logging.Logger;
import picocli.CommandLine;

/**
 * TODO r.hartinger write comment
 *
 * @author r.hartinger, 11.08.2025
 */
@CommandLine.Command
public class HelloCommand implements Runnable {

    private Logger log = Logger.getLogger(HelloCommand.class);

    @Override
    public void run() {
        log.warn("foo: \u00c4, \u00e4 \u00d6, \u00f6 \u00dc, \u00fc \u00df");

        log.warn("hello with umlauts äöüß from logger");
    }
}
