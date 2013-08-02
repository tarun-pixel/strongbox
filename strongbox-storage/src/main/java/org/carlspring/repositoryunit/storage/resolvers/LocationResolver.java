package org.carlspring.repositoryunit.storage.resolvers;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author mtodorov
 */
public interface LocationResolver
{

    InputStream getInputStream(String repository, String path)
            throws IOException;

    void initialize()
            throws IOException;

}
