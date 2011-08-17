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

/**
 * Type of GPS fix.
 */
public enum FixType {
    
    /** No GPS fix. */
    NONE,
    
    /** 2-D GPS fix. */
    FIX_2D,
    
    /** 3-D GPS fix. */
    FIX_3D,
    
    /** GPS fix with differential correction. */
    DGPS,
    
    /** Precise positioning service fix. */
    PPS
}
