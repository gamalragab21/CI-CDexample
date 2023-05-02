package com.example.ci_cdexample

import com.google.common.truth.Truth.assertThat
import org.junit.Test


internal class MathHelperTest{

    @Test
    fun test_add(){
        val result=MathHelper.add(5,6)
         assertThat(result).isEqualTo(11)
    }
    @Test
    fun test_mul(){
        val result=MathHelper.mul(5,6)
        assertThat(result).isEqualTo(30)
    }

    @Test
    fun test_sub(){
        val result=MathHelper.sub(12,6)
        assertThat(result).isEqualTo(6)
    }
}