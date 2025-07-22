package com.example.app.service;

import com.example.app.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getAllProducts() {
        return Arrays.asList(
                new Product("prod_001", "Premium Health Plan", "HEALTH", "Full medical + dental coverage including annual checkups, surgeries, and prescription drugs.", 200.00),

                new Product("prod_002", "Comprehensive Motor Cover", "MOTOR", "Protects against accidents, theft, fire, third-party liability, and damage to your vehicle.", 150.00),

                new Product("prod_003", "Essential Life Cover", "LIFE", "Life insurance offering financial security for dependents in case of the policyholder's death, with optional critical illness add-on.", 100.00),

                new Product("prod_004", "Smart Travel Insurance", "TRAVEL", "Covers international travel risks including medical emergencies, flight cancellations, lost luggage, and evacuation.", 75.00),

                new Product("prod_005", "Homeowners Property Shield", "PROPERTY", "Provides protection for buildings and contents against fire, burglary, natural disasters, and accidental damage.", 180.00),

                new Product("prod_006", "Future Scholar Education Plan", "EDUCATION", "An education savings and insurance combo that ensures your child’s school fees are covered even in the event of disability or death.", 120.00)



                );
    }
}
