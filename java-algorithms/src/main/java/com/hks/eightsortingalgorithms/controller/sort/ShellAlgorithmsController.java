package com.hks.eightsortingalgorithms.controller.sort;

import com.hks.eightsortingalgorithms.method.sort.ShellAlgorithms;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "平均O(n²)、最好O(n)、最坏O(n²)；空间复杂度：O(1)；稳定性：不稳定")
public class ShellAlgorithmsController {

    @Autowired
    ShellAlgorithms shellAlgorithms;

    @RequestMapping("/shellSorting")
    @ApiOperation("希尔排序")
    public int[] shellSorting(int[] args){
        return shellAlgorithms.sort(args);
    }

}
