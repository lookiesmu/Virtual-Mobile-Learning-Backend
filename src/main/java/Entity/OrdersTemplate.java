package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity

@Getter @Setter

public class OrdersTemplate {
    @Id @GeneratedValue
    @Column(name = "orders_template_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;
    private int count;
}