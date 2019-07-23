package guru.springframework.msscssm.repository;

import guru.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 2019-07-23.
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
