package webservice.controller;

import com.example.client.wsdl.EstateTransaction;
import com.example.client.wsdl.GetEstateTransactionsByEstateAgentIdResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webservice.EstateTransactionClient;

import java.util.List;

@Controller
public class EstateTransactionController {

    @Autowired
    EstateTransactionClient client;

    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/transactions")
    public String getEstateTransactions(Model model) {
        GetEstateTransactionsByEstateAgentIdResponse response = client.getEstateTransactionsByEstateAgentId(6);
        List<EstateTransaction> transactions =  response.getEstateTransactions();
        model.addAttribute("transactions", transactions);
        return "transactions";
    }
}
