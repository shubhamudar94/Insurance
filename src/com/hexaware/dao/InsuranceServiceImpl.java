package com.hexaware.dao;

import com.hexaware.entity.Policy;
import com.hexaware.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InsuranceServiceImpl implements IPolicyService {
	private Connection connection = DBConnection.getConnection();

	@Override
	public boolean createPolicy(Policy policy) {
		try (PreparedStatement preparedStatement = connection
				.prepareStatement("INSERT INTO Policy (policyId, policyName) VALUES (?, ?)")) {

			preparedStatement.setInt(1, policy.getPolicyId());
			preparedStatement.setString(2, policy.getPolicyName());

			return preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Policy getPolicy(int policyId) {
		try (PreparedStatement preparedStatement = connection
				.prepareStatement("SELECT * FROM Policy WHERE policyId = ?")) {

			preparedStatement.setInt(1, policyId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				return new Policy(resultSet.getInt("policyId"), resultSet.getString("policyName"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Collection<Policy> getAllPolicies() {
		List<Policy> policies = new ArrayList<>();

		try (Statement statement = connection.createStatement()) {

			ResultSet resultSet = statement.executeQuery("SELECT * FROM Policy");

			while (resultSet.next()) {
				Policy policy = new Policy(resultSet.getInt("policyId"), resultSet.getString("policyName"));
				policies.add(policy);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return policies;
	}

	@Override
	public boolean updatePolicy(Policy policy) {
		try (PreparedStatement preparedStatement = connection
				.prepareStatement("UPDATE Policy SET policyName = ? WHERE policyId = ?")) {

			preparedStatement.setString(1, policy.getPolicyName());
			preparedStatement.setInt(2, policy.getPolicyId());

			return preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deletePolicy(int policyId) {
		try (PreparedStatement preparedStatement = connection
				.prepareStatement("DELETE FROM Policy WHERE policyId = ?")) {

			preparedStatement.setInt(1, policyId);

			return preparedStatement.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
