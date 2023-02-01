package com.lockwood.compound.utils

import android.content.Context
import android.graphics.drawable.Drawable
import com.lockwood.compound.GravityDrawable
import com.lockwood.compound.extenions.isRtl

fun Drawable.copyWithGravity(
    context: Context,
    gravity: Int,
    padding: Int,
): GravityDrawable {
    return GravityDrawable(
        source = this,
        padding = padding,
        gravity = gravity,
        isRtl = context.isRtl
    )
}