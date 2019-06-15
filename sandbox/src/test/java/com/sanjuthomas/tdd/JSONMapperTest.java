package com.sanjuthomas.tdd;

import com.sanjuthomas.tdd.tdd.JSONMapper;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Map;

@RunWith(JUnitParamsRunner.class)
public class JSONMapperTest {

    @Test
    @FileParameters(value = "classpath:test.json", mapper = JSONMapper.class)
    public void shouldSupplyMap(Map data) {
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("value", data.get("key"));
    }
}

