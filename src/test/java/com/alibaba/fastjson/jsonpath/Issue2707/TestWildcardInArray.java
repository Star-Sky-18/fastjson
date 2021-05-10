package com.alibaba.fastjson.jsonpath.Issue2707;

import com.alibaba.fastjson.JSONPath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWildcardInArray {
    @Test
    public void testWildcardInArray(){
        String json = "{\"data\": [[{\"value\":1958,\"hb\":-0.03},{\"value\":0.28,\"hb\":-0.04}]]}";
        assertEquals("[0.28]",JSONPath.extract(json, "$.data[*][1].value"));
        JSONPath.eval();
    }
}
