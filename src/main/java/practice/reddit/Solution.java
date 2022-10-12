package practice.reddit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import java.io.IOException;
import java.util.*;


public class Solution {

    /*public Object fromJson( Map<String, Map<String, Integer>> json) throws JsonParseException
            , JsonMappingException, IOException {
        BillingStatus billingStatus = new ObjectMapper().readValue((JsonParser) json, BillingStatus.class);
        System.out.println("Java Object created from JSON String ");
        System.out.println("JSON String : " + json);
        System.out.println("Java Object : " + billingStatus);

        return billingStatus;
    }*/


    public static void main(String[] args) throws IOException {

        // Reddit reddit = new Reddit();

        Map<String, Map<String, Integer>> test = new HashMap<>();

        test.put("tran1", Map.<String, Integer>of(
                "user_id", 1,
                "ad_delivery_pennies", 1000,
                "transaction_timestamp", 1500000002
        ));
        test.put("tran2", Map.<String, Integer>of(
                "user_id", 1,
                "ad_delivery_pennies", 5000,
                "transaction_timestamp", 1500000001
        ));

        test.put("tran3", Map.<String, Integer>of(
                "user_id", 1,
                "payment_pennies", 500,
                "transaction_timestamp", 1500000003
        ))
        ;
        test.put("tran4", Map.<String, Integer>of(
                "user_id", 1,
                "ad_delivery_pennies", 1000,
                "transaction_timestamp", 1500000004,
                "payment_pennies", 500
        ));
        test.put("tran5", Map.<String, Integer>of(
                "user_id", 2,
                "ad_delivery_pennies", 1000,
                "transaction_timestamp", 1500000005,
                "payment_pennies", 500
        ));
        test.put("tran6", Map.<String, Integer>of(
                "user_id", 2,
                "payment_pennies", 500,
                "transaction_timestamp", 1500000005
        ));
        test.put("tran6", Map.<String, Integer>of(
                "user_id", 3,
                "payment_pennies", 1000,
                "transaction_timestamp", 1500000005
        ));


       /* ObjectMapper mapper = new ObjectMapper();

        reddit.fromJson(test);

        for (Map.Entry<String, Map<String, Integer>> entry : test.entrySet()) {
            test.put(entry.getKey(), mapper.convertValue(entry.getValue(), Map.class));
        }
        test.forEach((k, v) -> System.out.println(k + " -> " + v));

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        BillStatus billStatus = mapper.convertValue(test, BillStatus.class);
        String jsonResult = mapper.writeValueAsString(billStatus);


        String jsonResult = mapper.writerWithDefaultPrettyPrinter()
        .writeValueAsString(mapper.convertValue(test, BillingStatus.class));
        System.out.println("" + jsonResult);

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        BillingStatus billingStatus2 = mapper.readValue((JsonParser) test, BillingStatus.class);
        String response = mapper.writeValueAsString(billingStatus2);
        System.out.println(response);


        //String billingStatus1 = mapper.writeValueAsString(mapper.convertValue(test, Trans.class));*/

        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, String> jsonResult = new HashMap<>();

        test.forEach((k, v) -> {
            try {
                jsonResult.put(k, objectMapper.writeValueAsString(v));

            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });

        BillingStatus user1 = new BillingStatus(1);
        BillingStatus user2 = new BillingStatus(2);
        BillingStatus user3 = new BillingStatus(3);

        List<BillingStatus> billingStatusList = new ArrayList<>();

        jsonResult.forEach((k, v) ->
                {
                    try {
                        billingStatusList.add(objectMapper.readValue(v, BillingStatus.class));

                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
        billingStatusList.forEach(b -> {
            if (b.getUser_id() == 1) {
                user1.setPayment_pennies(user1.getPayment_pennies() + b.getPayment_pennies());
                user1.setAd_delivery_pennies(user1.getAd_delivery_pennies() + b.getAd_delivery_pennies());
            }

            if (b.getUser_id() == 2) {
                user2.setPayment_pennies(user2.getPayment_pennies() + b.getPayment_pennies());
                user2.setAd_delivery_pennies(user2.getAd_delivery_pennies() + b.getAd_delivery_pennies());
            }

            if (b.getUser_id() == 3) {
                user3.setPayment_pennies(user3.getPayment_pennies() + b.getPayment_pennies());
                user3.setAd_delivery_pennies(user3.getAd_delivery_pennies() + b.getAd_delivery_pennies());
            }
        });

        List<BillingStatus> usersList = new ArrayList<>();

        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        //System.out.println(usersList);
        usersList.forEach(System.out::println);
    }
}



