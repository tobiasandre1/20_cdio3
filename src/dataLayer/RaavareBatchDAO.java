package dataLayer;

import java.util.List;

import dataLayerInterfaces.DALException;
import dataLayerInterfaces.IRaavareBatchDAO;
import dataTransferObject.RaavareBatchDTO;

public class RaavareBatchDAO implements IRaavareBatchDAO {

	@Override
	public RaavareBatchDTO getRaavareBatch(int rbId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RaavareBatchDTO> getRaavareBatchList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RaavareBatchDTO> getRaavareBatchList(int raavareId) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createRaavareBatch(RaavareBatchDTO raavarebatch) throws DALException {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRaavareBatch(RaavareBatchDTO raavarebatch) throws DALException {
		// TODO Auto-generated method stub

	}

}
