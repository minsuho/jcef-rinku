// Copyright (c) 2024 The Chromium Embedded Framework Authors. All rights
// reserved. Use of this source code is governed by a BSD-style license that
// can be found in the LICENSE file.

package org.cef.handler;

/**
 * Shared texture of one accelerated paint (CEF {@code cef_accelerated_paint_info_t}). Valid only
 * during the {@code onAcceleratedPaint} callback: the texture returns to Chromium's pool when the
 * callback returns, so open it and copy it every time.
 */
public class CefAcceleratedPaintInfo {
    /** Windows: shared NT HANDLE of a D3D11 texture (open with OpenSharedResource1). */
    public long shared_texture_handle = 0;
    /** cef_color_type_t: 0 RGBA8, 1 BGRA8. */
    public int format = 0;
    /** Size of the texture itself (after a resize it can still be the old size for a few frames). */
    public int width = 0;
    public int height = 0;

    public CefAcceleratedPaintInfo() {}
}
