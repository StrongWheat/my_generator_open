package com.stranger.service;

import com.stranger.domain.GenTable;
import com.stranger.domain.GenTableData;

import java.util.List;
import java.util.zip.ZipOutputStream;

public interface GenService {

    List<GenTable> selectDbTableList();

    List<GenTableData> buildTableInfo(List<GenTable> genTables);

    void generatorCode(List<GenTableData> genTableData, ZipOutputStream zip);

    void setPkColumn(GenTable table);
}
