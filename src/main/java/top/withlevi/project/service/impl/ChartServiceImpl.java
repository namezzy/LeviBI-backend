package top.withlevi.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import top.withlevi.project.mapper.ChartMapper;
import top.withlevi.project.model.entity.Chart;
import top.withlevi.project.service.ChartService;

import org.springframework.stereotype.Service;

/**
* @author Hello World
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-02-22 11:12:49
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService {

}




