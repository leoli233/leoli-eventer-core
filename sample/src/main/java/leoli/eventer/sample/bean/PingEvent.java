package leoli.eventer.sample.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author leoli
 * @date 2020/09/23
 */
@Data
@AllArgsConstructor
public class PingEvent {

    private String context;

}
