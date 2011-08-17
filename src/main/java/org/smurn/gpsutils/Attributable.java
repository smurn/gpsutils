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

import java.util.HashMap;
import java.util.Map;

/**
 * Abstract base class for objects that can store arbitrary properties.
 * <p>Different data sources may provide very different information, for example
 * a GPS device used in aviation might also provide barometric data. If the
 * java classes would have a property for each possible value, the class would
 * be come very large and some usecases would still not be covered. That's why
 * some classes in this library allow arbirary properties to be assigned to
 * them. Those classes extend from this one.</p>
 * <p>Each property is identified by a key string. This string
 * commonly should be a fully classified java identifier to ensure uniqueness.
 * For used properties, keys are made available via static fields in the
 * subclasses.</p>
 * <p>The values in a property must be immutable. Other than that there
 * is no restriction. The users are adviced to document for each key what type
 * the values have to be.</p>
 */
public abstract class Attributable {

    /** Map with the properties, no entries with null value. */
    private final Map<String, Object> properties =
            new HashMap<String, Object>();

    /**
     * Gets the value of a property.
     * @param <T> Type of the value.
     * @param key Key that identifies the property.
     * @return Value of the property, Initially all properties are {@code null}.
     * @throws NullPointerException if {@code key} is {@code null}.
     */
    public final <T> T get(final String key) {
        if (key == null) {
            throw new NullPointerException("key must not be null");
        }
        return (T) properties.get(key);
    }

    /**
     * Sets the value of a property.
     * @param <T> Type of the value.
     * @param key Key that identifies the property.
     * @param value Value to set in the property.
     * @throws NullPointerException if {@code key} is {@code null}.
     */
    public final <T> void set(final String key, final T value) {
        if (key == null) {
            throw new NullPointerException("key must not be null");
        }
        if (value != null) {
            properties.put(key, value);
        } else {
            properties.remove(key);
        }
    }

    /**
     * Gets a map with all properties that have a non-{@code null} value.
     * @return Immutable map from property key to property value.
     */
    public final Map<String, Object> getProperties() {
        return properties;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Attributable other = (Attributable) obj;
        if (!this.properties.equals(other.properties)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return this.properties.hashCode();
    }
}
