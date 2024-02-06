package com.hexaware.main;

import com.hexaware.dao.InsuranceServiceImpl;
import com.hexaware.entity.Policy;
import com.hexaware.exception.PolicyNotFoundException;

import java.util.Collection;
import java.util.Scanner;

public class MainModule {

	public static void main(String[] args) {
		try {
			InsuranceServiceImpl insuranceService = new InsuranceServiceImpl();
			Scanner scanner = new Scanner(System.in);

			while (true) {
				System.out.println("Choose an action:");
				System.out.println("1. Create Policy");
				System.out.println("2. Get Policy");
				System.out.println("3. Get All Policies");
				System.out.println("4. Update Policy");
				System.out.println("5. Delete Policy");
				System.out.println("6. Exit");

				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter Policy ID:");
					int policyId = scanner.nextInt();
					System.out.println("Enter Policy Name:");
					String policyName = scanner.next();
					Policy newPolicy = new Policy(policyId, policyName);
					boolean isPolicyCreated = insuranceService.createPolicy(newPolicy);
					System.out.println("Policy Created: " + isPolicyCreated);
					break;

				case 2:
					System.out.println("Enter Policy ID to retrieve:");
					int policyIdToGet = scanner.nextInt();

					Policy retrievedPolicy = insuranceService.getPolicy(policyIdToGet);
					if (retrievedPolicy != null) {
						System.out.println("Retrieved Policy: " + retrievedPolicy);
					} else {
						throw new PolicyNotFoundException(Integer.toString(policyIdToGet));
					}
					break;

				case 3:
					Collection<Policy> allPolicies = insuranceService.getAllPolicies();
					System.out.println("All Policies: " + allPolicies);
					break;

				case 4:
					System.out.println("Enter Policy ID to update:");
					int policyIdToUpdate = scanner.nextInt();
					System.out.println("Enter Updated Policy Name:");
					String updatedPolicyName = scanner.next();
					Policy updatedPolicy = new Policy(policyIdToUpdate, updatedPolicyName);
					boolean isPolicyUpdated = insuranceService.updatePolicy(updatedPolicy);
					System.out.println("Policy Updated: " + isPolicyUpdated);
					break;

				case 5:
					System.out.println("Enter Policy ID to delete:");
					int policyIdToDelete = scanner.nextInt();
					boolean isPolicyDeleted = insuranceService.deletePolicy(policyIdToDelete);
					System.out.println("Policy Deleted: " + isPolicyDeleted);
					break;

				case 6:
					System.out.println("Exiting the program.");
					System.exit(0);

				default:
					System.out.println("Invalid choice. Please choose a valid action.");
					break;
				}
			}

		} catch (PolicyNotFoundException e) {
		} catch (Exception e) {
			System.err.println("An unexpected error occurred: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
