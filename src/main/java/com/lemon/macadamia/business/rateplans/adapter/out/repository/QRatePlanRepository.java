package com.lemon.macadamia.business.rateplans.adapter.out.repository;

import com.lemon.macadamia.business.rateplans.adapter.out.entity.RatePlanEntity;
import io.r2dbc.spi.Row;
import io.r2dbc.spi.RowMetadata;
import lombok.RequiredArgsConstructor;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.math.BigInteger;
import java.util.function.BiFunction;

@Repository
@RequiredArgsConstructor
public class QRatePlanRepository {
    private final DatabaseClient r2dbcDatabaseClient;

    public static final BiFunction<Row, RowMetadata, RatePlanEntity> MAPPING_FUNCTION = (row, rowMetadata) ->
            RatePlanEntity.builder()
                    .id(row.get("id", BigInteger.class))
                    .name(row.get("name", String.class))
                    .description(row.get("description", String.class))
                    .build();

    public Flux<RatePlanEntity> findByRatePlans() {
        return r2dbcDatabaseClient.sql("SELECT * FROM ratePlan")
                .map(MAPPING_FUNCTION)
                .all();
    }
}
