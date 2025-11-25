package ma.msi.billing.mapper;

import ma.msi.billing.dto.PaymentDTO;
import ma.msi.billing.entity.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {
    PaymentDTO toDto(Payment payment);
    Payment toEntity(PaymentDTO dto);
}
