package ru.practicum.shareit.request.data;

import lombok.Getter;
import org.springframework.stereotype.Component;
import ru.practicum.shareit.request.model.ItemRequest;

import java.util.HashMap;
import java.util.Map;

@Getter
@Component
public class InMemoryItemRequestStorage {

    private final Map<Long, ItemRequest> itemRequests = new HashMap<>();

    public void setItemRequest(ItemRequest itemRequest) {
        itemRequests.put(itemRequest.getRequestId(), itemRequest);
    }

    public ItemRequest getItemRequestById(Long id) {
        return itemRequests.get(id);
    }
}
