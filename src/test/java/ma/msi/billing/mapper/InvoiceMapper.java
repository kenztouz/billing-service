package ma.msi.billing.mapper;

import ma.msi.billing.dto.InvoiceDTO;
import ma.msi.billing.dto.InvoiceDTO;
import ma.msi.billing.entity.Invoice;
import org.mapper.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper {
    InvoiceDTO toDto(Invoice invoice);
    Invoice toEntity(InvoiceDTO dto);
}
