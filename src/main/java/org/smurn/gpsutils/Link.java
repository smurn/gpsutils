/*
 * Copyright 2011 Stefan C. Mueller.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smurn.gpsutils;

import java.net.URI;
import javax.activation.MimeType;
import javax.activation.MimeTypeParseException;

/**
 * Represents a hyper-link.
 */
public final class Link {

    private final URI uri;
    private final String text;
    private final String mimeType;

    /**
     * Creates an instance.
     * @param uri   Link to the document.
     * @param text  Text of the link (can be {@code null}).
     * @param mimeType Type of the document (can be {@code null}).
     * @throws NullPointerException if {@code uri} is {@code null}.
     */
    public Link(final URI uri, final String text, final MimeType mimeType) {
        this.uri = uri;
        this.text = text;
        this.mimeType = mimeType.getBaseType();
    }

    /**
     * Mime Type of the linked document.
     * @return Mime type.
     */
    public MimeType getMimeType() {
        try {
            return new MimeType(mimeType);
        }
        catch (MimeTypeParseException ex) {
            throw new RuntimeException();
        }
    }

    /**
     * Text of the link.
     * @return Text of the link.
     */
    public String getText() {
        return text;
    }

    /**
     * Adress of the linked document.
     * @return Adress of the linked document.
     */
    public URI getUri() {
        return uri;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Link other = (Link) obj;
        if (this.uri != other.uri && ( this.uri == null || !this.uri.equals(other.uri) )) {
            return false;
        }
        if (( this.text == null ) ? ( other.text != null ) : !this.text.equals(other.text)) {
            return false;
        }
        if (( this.mimeType == null ) ? ( other.mimeType != null ) : !this.mimeType.equals(other.mimeType)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + ( this.uri != null ? this.uri.hashCode() : 0 );
        hash = 11 * hash + ( this.text != null ? this.text.hashCode() : 0 );
        hash = 11 * hash + ( this.mimeType != null ? this.mimeType.hashCode() : 0 );
        return hash;
    }
}
